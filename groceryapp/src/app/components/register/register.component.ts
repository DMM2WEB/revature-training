import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/services/auth.service';
import { User } from '../../models/user'

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  // userModel = new User('Mathew', 'm@mail.com', '999999999', '123456')
  userModel = new User()
  // userModel = new User('Luke', 'l@mail.com', '333666999', '654321')

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }

  onSubmitHandler() {
    // console.log(data)
    console.log(this.userModel)
    this.authService.register(this.userModel).subscribe(response => {
      console.log(response);      
    })
  }
}


// http://apolis-grocery.herokuapp.com/api-docs/#/default/get_api_users
// GET/api/users
// {
//   "firstName": "Mathew",
//   "_id": "62a3147e7381540017be1a55",
//   "email": "m@mail.com",
//   "mobile": "999999999",
//   "password": "$2a$10$7LdMTdtG4qB10ca5XsboUOoLvqtVlV2jxKjnKvcN7xwqHxrUvbE9W",
//   "createdAt": "2022-06-10T09:53:02.470Z",
//   "__v": 0
// },
// 'user registered successfully'
// {
//   "firstName": "Luke",
//   "_id": "62a39ed718f4170017fa7563",
//   "email": "l@mail.com",
//   "mobile": "333666999",
//   "password": "$2a$10$bqYYeXYscOUuS98/V6HX0el4edNbILBwo1IcnpI6UQ1ihcATVJG4m",
//   "createdAt": "2022-06-10T19:43:19.740Z",
//   "__v": 0
// }
// 'user registered successfully'
