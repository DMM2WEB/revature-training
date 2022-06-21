import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  
  // getEmployee () {
  //   return[
  //     { id:1, name: 'Mathew', gender: 'Male' },
  //     { id:2, name: 'Mark', gender: 'Male' },
  //     { id:3, name: 'Luke', gender: 'Male' },
  //     { id:4, name: 'John', gender: 'Male' },
  //     { id:5, name: 'Benedict', gender: 'Male' },
  //   ]
  // }


  getPosts(): Observable<any[]> {
    return this.http.get<any[]> ('https://jsonplaceholder.typicode.com/posts')
  }


  getPhotos(): Observable<any[]> {
    return this.http.get<any[]> ('https://jsonplaceholder.typicode.com/photos')
  }
}
