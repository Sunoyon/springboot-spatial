package org.hs.spatial.domain.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vividsolutions.jts.geom.Point;

@Entity
@Table(name = "user_location")
public class UserLocation {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "geom")
	private Point geom;

	@Column(name = "user_id")
	private Long userId;

	public Long getId() {
		return id;
	}

	public Point getGeom() {
		return geom;
	}

	public Long getUserId() {
		return userId;
	}

	public UserLocation(Point coordinate, Long userId) {
		this.geom = coordinate;
		this.userId = userId;
	}

	public UserLocation() {
	}

}
