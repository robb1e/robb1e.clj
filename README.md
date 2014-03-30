# robb1e

A Clojure application for my personal homepage

## Development

- install [Lein](http://leiningen.org)

### Database

This project uses the Ruby ActiveRecord migrations. To setup the database, run:

    rake db:create db:migrate db:test:prepare

### SASS

Run `lein sass auto` to have lein watch the `resources/sass` directory and output to `resources/public/stylesheets`.

Run `lein sass clean` to clear the generated files.

See `project.clj` for configuration.

#### Sprockets

    rake assets:clobber assets:compile

### Testing

To run tests `lein test`

### Running

Two ways, run `lein repl`, then

    (require 'robb1e.web)
    (robb1e.web/start 8080)

or `lein run`

## Production

### Heroku

Set multiple build packs for both Clojure and Ruby

    heroku config:add BUILDPACK_URL=https://github.com/ddollar/heroku-buildpack-multi.git

### Migrations

Deploy the latest code, then:

`heroku run rake db:migrate`

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
