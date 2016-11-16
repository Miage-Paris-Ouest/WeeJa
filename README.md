# WeeJa  

[![Build Status](https://travis-ci.org/Miage-Paris-Ouest/WeeJa.svg?branch=master)](https://travis-ci.org/Miage-Paris-Ouest/WeeJa)

WeeJa est une application de génération de weekend en package regroupant le logement, la restauration et le divertissement selon les critères de chaque utilisateur.

<a href="http://weeja.strikingly.com/">Vitrine WeeJa</a>

Dépôt du projet Weekend Just Ahead:
<a href="http://www.olery.com/blog/the-best-travel-apis-discover-contribute/">Listing des APIs disponibles</a>

TRIP ADVISOR API:
<a href="https://developer-tripadvisor.com/content-api/documentation/">TripAdvisor</a>

### Use Case ###

![](https://github.com/Miage-Paris-Ouest/WeeJa/blob/master/Dossier%20Fonctionnel/WeeJa%20UseCase.png)

### Class Diagram ###

![](https://github.com/Miage-Paris-Ouest/WeeJa/blob/master/Dossier%20Fonctionnel/WeeJa%20ClassDiagram.png)

### Response Hotel (TripAdvisor API) ###

{
      "see_all_photos": "http://www.tripadvisor.com/LocationPhotos-g60745-d77638-mMCID-The_Inn_at_Longwood_Medical-Boston_Massachusetts.html",
      "web_url": "http://www.tripadvisor.com/Hotel_Review-g60745-d77638-Reviews-mMCID-The_Inn_at_Longwood_Medical-Boston_Massachusetts.html",
      "percent_recommended": null,
      "location_string": "Boston, Massachusetts",
      "location_id": "77638",
      "write_review": "http://www.tripadvisor.com/UserReview-g60745-d77638-mMCID-The_Inn_at_Longwood_Medical-Boston_Massachusetts.html",
      "price_level": "$$$",
      "api_detail_url": "http://api.tripadvisor.com/api/partner/2.0/location/77638?key=<YOUR KEY HERE>",
      "address_obj": {
        "street1": "342 Longwood Avenue",
        "street2": "",
        "city": "Boston",
        "state": "Massachusetts",
        "country": "United States",
        "postalcode": "02115",
        "address_string": "342 Longwood Avenue, Boston, MA 02115"
      },
      "distance": ".61",
      "category": {
        "name": "hotel",
        "localized_name": "Hotel"
      },
      "awards": [],
      "subcategory": [
        {
          "name": "hotel",
          "localized_name": "Hotel"
        }
      ],
      "num_reviews": "566",
      "rating_image_url": "http://www.tripadvisor.com/img/cdsi/img2/ratings/traveler/4.0-MCID-5.png",
      "name": "The Inn at Longwood Medical",
      "ancestors": [
        {
          "abbrv": null,
          "level": "City",
          "name": "Boston",
          "location_id": "60745"
        },
        {
          "abbrv": "MA",
          "level": "State",
          "name": "Massachusetts",
          "location_id": "28942"
        },
        {
          "abbrv": null,
          "level": "Country",
          "name": "United States",
          "location_id": "191"
        }
      ],
      "bearing": "northwest",
      "longitude": "-71.10668",
      "rating": "4.0",
      "latitude": "42.338406",
      "ranking_data": {
        "geo_location_id": "60745",
        "ranking_string": "#42 of 77 hotels in Boston",
        "geo_location_name": "Boston",
        "ranking_out_of": "77",
        "ranking": "42"
      }
}
    

Response Restaurant (TripAdvisor API) 

{
      "see_all_photos": "http://www.tripadvisor.com/LocationPhotos-g60745-d4225110-mMCID-Chacho_s_Pizza_Subs-Boston_Massachusetts.html",
      "cuisine": [],
      "web_url": "http://www.tripadvisor.com/Restaurant_Review-g60745-d4225110-Reviews-mMCID-Chacho_s_Pizza_Subs-Boston_Massachusetts.html",
      "percent_recommended": null,
      "location_string": "Boston, Massachusetts",
      "location_id": "4225110",
      "write_review": "http://www.tripadvisor.com/UserReview-g60745-d4225110-mMCID-Chacho_s_Pizza_Subs-Boston_Massachusetts.html",
      "price_level": null,
      "api_detail_url": "http://api.tripadvisor.com/api/partner/2.0/location/4225110?key=<YOUR KEY HERE>",
      "address_obj": {
        "street1": "1502 Tremont St",
        "street2": null,
        "city": "Boston",
        "state": "Massachusetts",
        "country": "United States",
        "postalcode": "02120",
        "address_string": "1502 Tremont St, Boston, MA 02120"
      },
      "distance": ".06",
      "category": {
        "name": "restaurant",
        "localized_name": "Restaurant"
      },
      "awards": [],
      "subcategory": [],
      "num_reviews": "0",
      "rating_image_url": null,
      "name": "Chacho's Pizza & Subs",
      "ancestors": [
        {
          "abbrv": null,
          "level": "City",
          "name": "Boston",
          "location_id": "60745"
        },
        {
          "abbrv": "MA",
          "level": "State",
          "name": "Massachusetts",
          "location_id": "28942"
        },
        {
          "abbrv": null,
          "level": "Country",
          "name": "United States",
          "location_id": "191"
        }
      ],
      "bearing": "north",
      "longitude": "-71.09922",
      "rating": null,
      "latitude": "42.33227",
      "ranking_data": null
}
    
