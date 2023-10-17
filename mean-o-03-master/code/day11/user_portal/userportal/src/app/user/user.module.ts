import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { SignupComponent } from './signup/signup.component';
import { SigninComponent } from './signin/signin.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [SignupComponent, SigninComponent],
  imports: [CommonModule, UserRoutingModule, FormsModule],
})
export class UserModule {}
