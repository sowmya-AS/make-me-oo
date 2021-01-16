package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.oop.Point.direction;
import static org.oop.Point.distance;

public class PointTest {
    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        double expectedDistance = 0;

        double actualDistance = distance(origin, origin);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        double expectedDistanceFromOriginToPoint1 = 1;
        double expectedDistanceFromOriginToPoint2 = 1;

        double distanceToPoint1 = distance(origin, point1);
        double distanceToPoint2 = distance(origin, point2);

        Assertions.assertEquals(expectedDistanceFromOriginToPoint1, distanceToPoint1);
        Assertions.assertEquals(expectedDistanceFromOriginToPoint2, distanceToPoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        double expectedDistance = 2;

        double actualDistance = distance(point1, point2);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        Point origin = new Point(0, 0);
        double expectedDirectionOfPoint1FromOrigin = 0;
        double expectedDirectionOfPoint2FromOrigin = 0;

        double actualDirectionOfPoint1FromOrigin = direction(origin, point1);
        double actualDirectionOfPoint2FromOrigin = direction(origin, point2);

        Assertions.assertEquals(expectedDirectionOfPoint1FromOrigin, actualDirectionOfPoint1FromOrigin);
        Assertions.assertEquals(expectedDirectionOfPoint2FromOrigin, actualDirectionOfPoint2FromOrigin);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        double expectedDirectionOfPoint1FromOrigin = Math.PI;
        double expectedDirectionOfPoint2FromOrigin = Math.PI;

        double actualDirectionOfPoint1FromOrigin = direction(origin, point1);
        double actualDirectionOfPoint2FromOrigin = direction(origin, point2);

        Assertions.assertEquals(expectedDirectionOfPoint1FromOrigin, actualDirectionOfPoint1FromOrigin);
        Assertions.assertEquals(expectedDirectionOfPoint2FromOrigin, actualDirectionOfPoint2FromOrigin);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double expectedDirectionOfPoint1FromOrigin = Math.PI / 2;
        double expectedDirectionOfPoint2FromOrigin = Math.PI / 2;

        double actualDirectionOfPoint1FromOrigin = direction(origin, point1);
        double actualDirectionOfPoint2FromOrigin = direction(origin, point2);

        Assertions.assertEquals(expectedDirectionOfPoint1FromOrigin, actualDirectionOfPoint1FromOrigin);
        Assertions.assertEquals(expectedDirectionOfPoint2FromOrigin, actualDirectionOfPoint2FromOrigin);
    }
}