# Head First Rails Chapter 2
http://www.headfirstlabs.com/books/hfrails/
## Database of Advertisements
### Environment
- ruby 2.2.4
- rails 5.0.1
- sqlite3 1.3.13

### A Lisf of Execution Commands
Make First application.
I don't use the 'scaffold' command.
```
rails new mebay
# => created a new application "mebay"
cd mebay
bundle exec rails generate model ad name:string description:text price:decimal seller_id:integer email:string img_url:string
bundle exec rake db:migrate
bundle exec rails generate controller ads
```

Replace db/development.sqlite3 from http://www.headfirstlabs.com/books/hfrails/
- I need exporting data and importing data because of the difference of the versions of sqlite.

```
# => download development.sqlite3 in ./db and rename head-first.sqlite3
cd db
sqlite3 head-first.sqlite3
sqlite> .output head-first.txt
sqlite> select * from ads
sqlite> .quit
sqlite3 development.sqlite3
sqlite> .import head-first.txt ads
sqlite> .quit
cd ../
```

Make First views.
```
# => create app/views/show.html.erb
# => edit config/routes.rb
bundle exec rails server
```

Show data in views.
```
# => edit controller, view
bundle exec rails server
# => access http://localhost:3000/ads/3
```

Show index of ads.
```
# => edit config/routes, controller, view
bundle exec rails server
# => access http://localhost:3000/ads
```

Make custom views
```
# => download styles:chap2_hfrails_code_stylesheets_and_images.zip
# => rename default.css to ad.css
# => create view layouts/ads, edit views ads
bundle exec rails server
```

# Head First Rails Chapter 3
Continue developing the previous chapter application "Mebay"!

### A Lisf of Execution Commands
Add the create function.
```
# => edit config/routes
# => create app/views/ads/new.html.erb
# => edit app/controllers/ads_controller#new
bundle exec rails server
Ctrl-C
# => it doesn't work... we need 'create'.
# => edit config/routes
# => create app/views/ads/create.html.erb
# => edit app/controllers/ads_controller#create
bundle exec rails server
```

Add redirect
```
# => edit app/controllers/ads_controller#create
```
