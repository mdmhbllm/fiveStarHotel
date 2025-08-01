package cse213.final_project_2231379;

public class ShiftPreference {
    private String preferredShift;
    private String daysAvailable;
    private String notes;

    public ShiftPreference(String preferredShift, String daysAvailable, String notes) {
        this.preferredShift = preferredShift;
        this.daysAvailable = daysAvailable;
        this.notes = notes;
    }

    public String getPreferredShift() {
        return preferredShift;
    }

    public void setPreferredShift(String preferredShift) {
        this.preferredShift = preferredShift;
    }

    public String getDaysAvailable() {
        return daysAvailable;
    }

    public void setDaysAvailable(String daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "ShiftPreference{" +
                "preferredShift='" + preferredShift + '\'' +
                ", daysAvailable='" + daysAvailable + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
