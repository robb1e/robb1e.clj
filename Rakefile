require 'standalone_migrations'
require 'sprockets/standalone'

StandaloneMigrations::Tasks.load_tasks

Sprockets::Standalone::RakeTask.new(:assets) do |task, sprockets|
  task.assets   = %w(application.css)
  task.sources  = %w(resources/sass)
  task.output   = File.expand_path('resources/public/stylesheets', Dir.pwd)
  task.compress = true
  task.digest   = true
end
