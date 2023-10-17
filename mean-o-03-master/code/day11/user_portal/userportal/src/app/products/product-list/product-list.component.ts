import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/cart/cart.service';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
})
export class ProductListComponent implements OnInit {
  products = [];

  constructor(
    private cartService: CartService,
    private service: ProductService
  ) {}

  ngOnInit(): void {
    this.loadProducts();
  }

  onAddToCart(product) {
    this.cartService.addToCart(product._id).subscribe((response) => {
      if (response['status'] == 'success') {
        this.loadProducts();
      } else {
        alert(response['error']);
      }
    });
  }

  loadProducts() {
    this.service.getProducts().subscribe((response) => {
      if (response['status'] == 'success') {
        console.log(response);
        this.products = response['data'];
      } else {
        alert(response['error']);
      }
    });
  }
}
