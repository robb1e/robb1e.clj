require 'standalone_migrations'
require 'sprockets/standalone'
require 'sass'

Sass.load_paths << File.expand_path("bower_components/bourbon/app/assets/stylesheets")
Sass.load_paths << File.expand_path("bower_components/neat/app/assets/stylesheets")
Sass.load_paths << File.expand_path("bower_components/compass-mixins/lib")

StandaloneMigrations::Tasks.load_tasks

Sprockets::Standalone::RakeTask.new(:assets) do |task, sprockets|
  task.assets   = %w(application.css)
  task.sources  = %w(resources/sass)
  task.output   = File.expand_path('resources/public/assets', Dir.pwd)
  task.compress = true
  task.digest   = true
end
