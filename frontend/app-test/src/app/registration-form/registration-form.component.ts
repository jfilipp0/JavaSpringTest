import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthenticationService } from '../login/auth.service';

@Component({
  selector: 'app-registration-form',
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.sass']
})
export class RegistrationFormComponent implements OnInit {
  
  username: string;
  password : string;
  repassword : string;
  fullname : string;
  cpf : string;
  nationality : string;
  birthday : Date;


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authenticationService: AuthenticationService) { }

  ngOnInit(): void {
  }

  handleRegister(){

  }

  handleToLogin(){
    this.router.navigate(['/login'])
  }

}
