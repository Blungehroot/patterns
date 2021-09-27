package com.blungehroot.patterns.behavioral.iterator;

public class RomeTour implements Collection {
    private String tour;
    private String[] tourType;

    public RomeTour(String tour, String[] tourType) {
        this.tour = tour;
        this.tourType = tourType;
    }

    @Override
    public Iterator getIterator() {
        return new TourTypeIterator();
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String[] getTourType() {
        return tourType;
    }

    public void setTourType(String[] tourType) {
        this.tourType = tourType;
    }

    private class TourTypeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < tourType.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return tourType[index++];
        }
    }
}
