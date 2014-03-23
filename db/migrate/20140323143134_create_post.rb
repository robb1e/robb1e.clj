class CreatePost < ActiveRecord::Migration
  def up
    create_table :posts do |t|
      t.string :excerpt
      t.string :publication
      t.string :uri
      t.string :title
      t.datetime :published_at
      t.timestamps
    end
  end

  def down
    drop_table :posts
  end
end
