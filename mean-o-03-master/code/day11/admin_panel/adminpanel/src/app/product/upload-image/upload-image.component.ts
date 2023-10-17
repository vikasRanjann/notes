import { Component, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-upload-image',
  templateUrl: './upload-image.component.html',
  styleUrls: ['./upload-image.component.css'],
})
export class UploadImageComponent implements OnInit {
  product: any;
  selectedImage: any;

  constructor(
    private service: ProductService,
    private activeModal: NgbActiveModal
  ) {}

  ngOnInit(): void {}

  onImageSelected(event) {
    this.selectedImage = event.target.files[0];
  }

  onUpload() {
    this.service
      .uploadImage(this.product._id, this.selectedImage)
      .subscribe((response) => {
        if (response['status'] == 'success') {
          this.activeModal.dismiss('ok');
        } else {
          alert(response['error']);
        }
      });
  }

  onCancel() {
    this.activeModal.dismiss('ok');
  }
}
