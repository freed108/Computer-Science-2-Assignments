public class Truck extends Vehicle
{
        private double m_load;
        private int m_towing;

        public void setTruck(double load, int towing)
        {
                this.m_load = load;
                this.m_towing = towing;
        }

        public double getload()
        {
                return m_load;
        }

        public int gettowing()
        {
                return m_towing;
        }

        public void setLoad(double load)
        {
                load = 2.4;
        }

        public void setTowing(int towing)
        {
                towing = 50;
        }

        public void readOutput()
        {
                System.out.println("The truck can hold " + m_load + " tons and it can tow " + m_towing + " pounds");
	}
}
