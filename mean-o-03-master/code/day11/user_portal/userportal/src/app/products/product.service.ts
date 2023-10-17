import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  url = 'http://localhost:3000/product';

  constructor(private http: HttpClient) {}

  getProducts() {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    return this.http.get(this.url, httpOptions);
  }
}
