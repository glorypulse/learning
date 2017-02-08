# Head First Rails Chapter 2
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
