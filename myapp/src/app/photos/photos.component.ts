import { Component, OnInit } from '@angular/core';
import { DataService } from "../data.service";

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnInit {

  photos: any[] = []

  constructor(private dataService: DataService) { }

  ngOnInit(): void {
    this.dataService.getPhotos().subscribe(data => {
      this.photos = data
    })
  }
}
