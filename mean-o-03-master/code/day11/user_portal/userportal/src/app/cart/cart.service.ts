import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class CartService {
  url = 'http://localhost:3000/cart';

  constructor(private http: HttpClient) {}

  getItems() {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    return this.http.get(this.url, httpOptions);
  }

  updateQuantity(id: any, quantity: any) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    const body = {
      quantity,
    };

    return this.http.patch(this.url + `/${id}/quantity`, body, httpOptions);
  }

  addToCart(id: string) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    const body = {
      product: id,
    };

    return this.http.post(this.url, body, httpOptions);
  }
}
