import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class OrderService {
  url = 'http://localhost:3000/order';

  constructor(private http: HttpClient) {}

  getOrders() {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    return this.http.get(this.url, httpOptions);
  }
}
