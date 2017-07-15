public class Date {


    enum Day{ Saturday(1), Sunday(2), Monday(3), Tusesday(4), Wednesday(5), Thursday(6), Friday(7);
        private  final int NoOfDay;

        Day(int NoOfDay){

            this.NoOfDay=NoOfDay;
        }

        public int getNoOfDay() {
            return NoOfDay;
        }
    }
    enum Month{ Janury(1), February(2), March(3), April(4), May(5), June(6),
        July(7), August(8), september(9), October(10), November(11), December(12);

        private int NoOfMonth;

        Month(int NoOfMoth) {
            this.NoOfMonth = NoOfMoth;

        }

        public int getNoOfMonth() {
            return NoOfMonth;
        }
    }

}