package Talleres.Taller2.ej2;

    public class FixedSubwayCard extends SubwayCard {

        private int rides;

        public FixedSubwayCard(SubwayCentral subwayCentral, int rides) {
            super(subwayCentral);
            this.rides = rides;
        }

        @Override
        protected boolean canRide() {
            return rides > 0;
        }

        @Override
        public void applyCost() {
            rides--;
        }
}
