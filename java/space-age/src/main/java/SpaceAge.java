class SpaceAge {

   double second;

   private static final double EARTH_SECONDS = 31557600;
   private static final double MERCURY_ORBITAL = 0.2408467;
   private static final double VENUS_ORBITAL = 0.61519726;
   private static final double MARS_ORBITAL = 1.8808158;
   private static final double JUPITER_ORBITAL = 11.862615;
   private static final double SATURN_ORBITAL = 29.447498;
   private static final double URANUS_ORBITAL = 84.016846;
   private static final double NEPTUNE_ORBITAL = 164.79132;

    SpaceAge(double seconds) {
        this.second = seconds;
    }

    double getSeconds() {
        return this.second;
    }

    double onEarth() {
        return getSeconds()/EARTH_SECONDS;
    }

    double onMercury() {
        return  onEarth()/MERCURY_ORBITAL;
    }

    double onVenus() {
        return onEarth()/VENUS_ORBITAL;
    }

    double onMars() {
        return onEarth()/MARS_ORBITAL;
    }

    double onJupiter() {
        return onEarth()/JUPITER_ORBITAL;
    }

    double onSaturn() {
        return onEarth()/SATURN_ORBITAL;
    }

    double onUranus() {
        return onEarth()/URANUS_ORBITAL;
    }

    double onNeptune() {
       return onEarth()/NEPTUNE_ORBITAL;
    }
}
