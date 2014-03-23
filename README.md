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

### Testing

To run tests `lein test`

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
