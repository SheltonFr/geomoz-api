CREATE TABLE regions
(
    id   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name VARCHAR(32)                             NOT NULL,
    CONSTRAINT pk_region PRIMARY KEY (id),
    CONSTRAINT uc_region_name UNIQUE (name)
);

CREATE TABLE provinces
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name       VARCHAR(32)                             NOT NULL,
    abbr       varchar(6),
    region     BIGINT                                  NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_provinces PRIMARY KEY (id),
    CONSTRAINT uc_provinces_abbr UNIQUE (abbr),
    CONSTRAINT uc_provinces_name UNIQUE (name),
    CONSTRAINT fk_province_region FOREIGN KEY (region) REFERENCES regions (id)
);


CREATE TABLE districts
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name       VARCHAR(64)                             NOT NULL,
    abbr       VARCHAR(6),
    province   BIGINT                                  NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT pk_districts PRIMARY KEY (id),
    CONSTRAINT uc_districts_abbr UNIQUE (abbr),
    CONSTRAINT uc_districts_name UNIQUE (name),
    CONSTRAINT fk_district_province FOREIGN KEY (province) REFERENCES provinces (id)
);
