import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  url = 'http://192.168.1.19:4000/user';

  constructor(private http: HttpClient) {}

  getUsers() {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    return this.http.get(this.url, httpOptions);
  }

  toggleUser(id: any, status: boolean) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    const body = {
      status,
    };

    return this.http.patch(this.url + '/' + id + '/status', body, httpOptions);
  }
}
