/**
 * Returns the state of this book as JSON data.
 *
 * @return A JSON representation of this book.
 */
public String toJSON()
{
    String jsonString  = null;
    ObjectMapper mapper = new ObjectMapper();

    try {
        jsonString = mapper.writeValueAsString(this);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }

    return jsonString;
}
