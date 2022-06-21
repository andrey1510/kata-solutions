package tests;

import level8.VolumeOfCuboid;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestVolumeOfCuboid {

    @Test
    public void testVolumeOfCuboid1() {
        assertEquals(24.0, VolumeOfCuboid.getVolumeOfCuboid(2,3,4), 1e-15);
        assertEquals(0.0, VolumeOfCuboid.getVolumeOfCuboid(2,0,5), 1e-15);
    }
}
