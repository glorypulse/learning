# Head First Rails Chapter 1
## Sold Ticket Information System
### Environment
- rails 4.2.1
- sqlite3

### A Lisf of Execution Commands
```
bundle init
# edit Gemfile: add rails
bundle install
bundle exec rails new tickets
# => created a "tickets" folder
cd tickets
bundle exec rails start
# => started sample application
bundle exec rails generate scaffold ticket name:string seat_id_seq:string address:text price_paid:decimal email_address:string
# => created a view, a controller, a model and a migration for ticket
```
