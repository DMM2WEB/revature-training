import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl:'./test.component.html',
  
//   template: `
    
    
//       <!-- <h1>Hello {{name}}</h1>
//     <h1>{{10 + 20 + 30}}</h1>
//     <h1>{{'Welcome' + name}}</h1>
//     <h1>{{name}}</h1>
//     <h1>{{name.length}}</h1>
//     <h1>{{name.toUpperCase()}}</h1>
//     <h1>{{sayHello()}}</h1> -->


//       <!-- <img src="https://assets.stickpng.com/images/580b57fcd9996e24bc43c51f.png" width="150" /><br>
//     <img [src]="image" width="150" /><br>
//     <img src="{{image}}" width="150" /><br>

//     <button disabled>Button</button>
//     <button disabled="{{isDisabled}}">Button - interpolation</button>
//     <button [disabled]="isDisabled">Button - property binding</button>

//     <img src="{{imagePath + imageName}}" width="150" /><br>
//     /*<img [src]="imagePath" />*/ -->
    
    
//     <!-- /*<button (click)="onClickHandler()">Button</button>*/
//     <h2>{{ message }}</h2>
//     <button (click)="onClickHandler()">Login</button>

//     <button (dblclick)="onDblClickHandler()">Double Click</button>

//     <button (click)="onClickHandler2($event)" >Clicked</button><br><br>
//     <hr>

//     <input type="text" #myInput class="mytext" name="mytext" id="t1">
//     <button (click)="onButtonClicked(myInput)">Get Data</button>
//     <h2>{{name}}</h2>

// <br>
// <br>

// <textarea (keypress)="onKeyPress(mytext)" #mytext cols="30" rows="10"></textarea>
// <h1>{{ 140 - text.length }}</h1> -->


//   <!-- <h1>{{username}}</h1>
//   <input type="text" [(ngModel)]="username"> -->


//   <!-- <h1 class="text-success">Heading</h1>
//   <h1 [class]="successClass">Some Heading</h1>
//   <h1 [class.text-danger]="hasError">Some Other Heading</h1>
//   <br>
//   <input type="text" class="form-control" [class.is-invalid]="hasError">
//   <small class="text-danger" [class.d-none]="!hasError">This is a required field</small>

//   <h1 [ngClass]="customStyle">Custom Style Heading</h1> -->


//   <!-- <h1 style="color: blue">Heading</h1>
//   <h1 [style.color]="hasError ? 'red' : 'green'">Some Heading</h1>

//   <h1 [style.color]="specialColor">Some Other Heading</h1>
//   <h1 [ngStyle]="customStyle">Custom Style</h1> -->


//   `,
  styleUrls: ['./test.component.css'],
  // styles: [
  // `

  // /* .text-success{
  //   color: green
  // }
  // .text-danger{
  //   color: red
  // }
  // .text-special{
  //   font-style: italic
  // } */

  // `
  // ]
})
export class TestComponent implements OnInit {


  // public name = "Peter";


  // public image = "https://assets.stickpng.com/images/580b57fcd9996e24bc43c51f.png"

  // public isDisabled = false

  // public imagePath = "https://assets.stickpng.com/images/";
  // public imageName = "580b57fcd9996e24bc43c51f.png";


  // public message = 'Hello Guest';
  // public name = ''

  // public text = ''


  // public username = "Benedict"

  
  // successClass = 'text-success'
  // hasError = false;
  // isSpecial = false

  // customStyle ={
  //   'text-success': !this.hasError,
  //   'text-danger': this.hasError,
  //   'text-special': this.isSpecial
  // }


  // hasError = false;
  // public specialColor = '#999999'

  // public customStyle = {
  //   color: 'red',
  //   fontSize: '36px',
  //   backgroundColor: 'green'
  // }


  // display = false;
  // isLoggedIn = false;


  // number = 5
  // numberInWord = 'Three'


  // names = ['Mathew', 'Mark', 'Luke', 'John', 'Benedict']

  // employees = [
  // {id: 1, name: 'Mathew', gender: 'male', email: 'mt@mail.com'},
  // {id: 2, name: 'Mark', gender: 'male', email: 'mr@mail.com'},
  // {id: 3, name: 'Luke', gender: 'male', email: 'l@mail.com'},
  // {id: 4, name: 'John', gender: 'male', email: 'j@mail.com'},
  // {id: 5, name: 'Peter', gender: 'male', email: 'pe@mail.com'},
  // {id: 6, name: 'Paul', gender: 'male', email: 'pa@mail.com'},
  // ]


  // names = ['Mathew', 'Mark', 'Luke', 'John', 'Benedict']

  // employees: any[] = []


  public name = 'Mathew Evangelist'
  
  public person = {
    firstName: 'Luke',
    lastName: 'Evangelist'
  }

  public currentDate = new Date();


  constructor() {

    
    // this.employees = [
    //   {id: 1, name: 'Mathew', gender: 'male', email: 'mt@mail.com'},
    //   {id: 2, name: 'Mark', gender: 'male', email: 'mr@mail.com'},
    //   {id: 3, name: 'Luke', gender: 'male', email: 'l@mail.com'},
    //   {id: 4, name: 'John', gender: 'male', email: 'j@mail.com'},
    // ]
    

  }

  ngOnInit(): void {
  }


  // sayHello() {
  //   return 'Hello' + this.name;
  // }
  

  // onClickHandler() {
  //   console.log('button clicked');
  //   this.message = 'Hello Mark'
  // }

  // onDblClickHandler(){
  //   console.log('button click')
  // }

  // onClickHandler2(event: any){
  //     console.log(event)
  // }

  // onButtonClicked(input: any){
  //   console.log(input.value)
  // }

  // onKeyPress(mytext: any){
  //   this.text = mytext.value
  // }


  // onButtonClicked() {
  //   this.employees = [
  //     {id: 1, name: 'Mathew', gender: 'male', email: 'mt@mail.com'},
  //     {id: 2, name: 'Mark', gender: 'male', email: 'mr@mail.com'},
  //     {id: 3, name: 'Luke', gender: 'male', email: 'l@mail.com'},
  //     {id: 4, name: 'John', gender: 'male', email: 'j@mail.com'},
  //     {id: 5, name: 'Peter', gender: 'male', email: 'pe@mail.com'},
  //     //{id: 6, name: 'Paul', gender: 'male', email: 'pa@mail.com'},
  //   ]
  // }

  // trackById(employee: any) {
  //   return employee.id;
  // }


}
