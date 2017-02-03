# Head First Rails Chapter 1
## Sold Ticket Information System
### Environment
- rails 4.2.1
- sqlite3

### A Lisf of Execution Commands
Make First application.
```
bundle init
# edit Gemfile: add rails
bundle install
bundle exec rails new tickets
# => created a "tickets" folder
cd tickets
bundle exec rails server
# => started sample application : http://localhost:3000
bundle exec rails generate scaffold ticket name:string seat_id_seq:string address:text price_paid:decimal email_address:string
# => created a view, a controller, a model and a migration for ticket
bundle exec rake db:migrate
# => created a ticket table in DB
bundle exec rails server
# => started tickets application! : http://localhost:3000/tickets
```

Modify the Title of sead_id_seq
```
# => edit view files
bundle exec rails server
```

Add a new column 'phone' in tickets table
```
 bundle exec rails generate migration AddPhoneToTickets phone:string
 # => created a migration code
 bundle exec rake db:migrate
 # => added 'phone' column in tickets table
 # => edit view files, controller file
 bundle exec rails server
 ```

Add a Event Record
```
bundle exec rails generate scaffold Event artist:string description:text price_low:decimal price_high:decimal event_date:date
# => created Event view, controller, model

```