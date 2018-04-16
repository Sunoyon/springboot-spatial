CREATE TABLE user_location (
  id BIGSERIAL,
  geom GEOMETRY NOT NULL,
  user_id bigint NOT NULL,
  PRIMARY KEY (id)
);
CREATE INDEX user_location_coordinate_idx ON user_location USING GIST (geom);