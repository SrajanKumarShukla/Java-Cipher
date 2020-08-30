import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {from} from 'rxjs';
@Component({
  selector: 'app-headlines',
  templateUrl: './headlines.component.html',
  styleUrls: ['./headlines.component.css']
})
export class HeadlinesComponent implements OnInit {
  url;
  Key = '3edc549d1db641b2a2457004fb309e04';
  baseurl= 'https://newsapi.org/v2/top-headlines?country=in'
  headlinetext = "Latest Headlines"; 
  news;
  constructor(private http:HttpClient) {
    this.url = this.baseurl + '&apiKey='+ this.Key;
   }

  ngOnInit() {
    this.fetchNews();

  }
  fetchNews(){
    this.http.get (this.url)
    .subscribe(data => {
      console.log(data['articles']);
      this.news=data['articles']
    })
  }
  
}
