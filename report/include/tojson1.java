/**
 * Returns the state of this book as JSON data.
 *
 * @return A JSON representation of this book.
 */
public String toJSON()
{
    final String FORMAT = "\"%s\": \"%s\", ";

    StringBuilder sb = new StringBuilder("{");
    sb.append(String.format(FORMAT, "id", getId()));
    sb.append(String.format(FORMAT, "title", getTitle()));
    sb.append(String.format(FORMAT, "author", getAuthors()));
    sb.append(String.format(FORMAT, "genre", getGenre()));
    sb.append(String.format(FORMAT, "published", getDate()));
    sb.append(String.format(FORMAT, "price", getPrice()));
    sb.append(String.format(FORMAT, "description", getDescription()));
    return sb.append("}").toString();
}
