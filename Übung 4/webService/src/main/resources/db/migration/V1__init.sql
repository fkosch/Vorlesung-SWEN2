CREATE TABLE velocities (
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  animal VARCHAR(255) NOT NULL,
  velocity VARCHAR(255) NOT NULL
);

INSERT INTO velocities (animal, velocity) VALUES
('Gepard','122 km/h'),
('Windhund','110 km/h'),
('Gazelle','90 km/h'),
('Antilope','90 km/h'),
('Gabelbock','85 km/h'),
('Strauss','70 km/h'),
('Pferd','70 km/h'),
('Feldhase','70 km/h'),
('Bär','50 km/h'),
('Flusspferd','48 km/h'),
('Afrikan. Elefant','40 km/h'),
('Mensch','38 km/h'),
('Rennechse','29 km/h'),
('Riesen-Schildkröte','0,37 km/h'),
('Schnecke','0,027 km/h');
