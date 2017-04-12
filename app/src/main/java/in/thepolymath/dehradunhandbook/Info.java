package in.thepolymath.dehradunhandbook;

/**
 * This class helps create the information entry
 */

public class Info {

    /**
     * Description for the place
     */
    private String descPlace;

    /**
     * Name of the place
     */
    private String namePlace;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Image resource ID for the place
     */
    private int ImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Info object.
     *
     * @param name        is the name of the place
     * @param description is description for the place
     */
    public Info(String name, String description) {
        descPlace = description;
        namePlace = name;
    }

    /**
     * Create a new Info object.
     *
     * @param name            is the name of the place
     * @param description     is description for the place
     * @param imageResourceId is the resourceId for the images of place
     */
    public Info(String name, String description, int imageResourceId) {
        descPlace = description;
        namePlace = name;
        ImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place
     */
    public String getNamePlace() {
        return namePlace;
    }

    /**
     * Get the description for the place
     */
    public String getDescPlace() {
        return descPlace;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return ImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }
}