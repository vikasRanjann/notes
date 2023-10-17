import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  url = 'http://192.168.1.19:4000/product';

  constructor(private http: HttpClient) {}

  uploadImage(_id: any, selectedImage: any) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    const body = new FormData();
    body.append('image', selectedImage);

    return this.http.post(this.url + '/upload-image/' + _id, body, httpOptions);
  }

  createProduct(
    title: string,
    description: string,
    price: string,
    category: string
  ) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    const body = {
      title,
      description,
      price,
      category,
    };
    return this.http.post(this.url, body, httpOptions);
  }

  deleteProduct(id: string) {
    const token = sessionStorage['token'];
    const httpOptions = {
      headers: new HttpHeaders({
        token: token,
      }),
    };

    return this.http.delete(this.url + '/' + id, httpOptions);
  }

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
