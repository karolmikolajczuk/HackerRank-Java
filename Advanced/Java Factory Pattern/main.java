
            if (order.equalsIgnoreCase("Pizza")) {
                return new Pizza();
            } else if (order.equalsIgnoreCase("Cake")) {
                return new Cake();
            } else {
                return null;
            }

