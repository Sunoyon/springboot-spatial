package org.hs.spatial.repository;

import javax.inject.Inject;

import org.hs.spatial.App;
import org.hs.spatial.domain.db.UserLocation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.io.ParseException;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(App.class)
public class UserLocationRepositoryTest {

	@Inject
	UserLocationRepository userLocationRepository;

	@Test
	public void saveTest() throws ParseException {
		GeometryFactory geometryFactory = new GeometryFactory();
		Point coordinate2 = geometryFactory.createPoint(new Coordinate(90.6, 25.4));
		UserLocation userLocation = new UserLocation(coordinate2, 100l);
		userLocationRepository.save(userLocation);
	}
}
