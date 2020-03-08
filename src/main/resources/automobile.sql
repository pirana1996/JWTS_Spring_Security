CREATE TABLE car_listings (
  id bigserial PRIMARY KEY,
  name text,
  fuel text,
  milages bigint,
  location text,
  date timestamp with time zone
);
