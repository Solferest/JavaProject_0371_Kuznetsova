public class Gallery {
    private Painters PaintersObject;
    private Users UsersObject;

    public Painters getPainters() {
        return PaintersObject;
    }

    public Users getUsers() {
        return UsersObject;
    }

    public void setPainters(Painters paintersObject) {
        this.PaintersObject = paintersObject;
    }

    public void setUsers(Users usersObject) {
        this.UsersObject = usersObject;
    }
}
public class Users {
    User [] UserObject;

    public User [] getUser() {
        return UserObject;
    }

    public void setUser(User [] userObject) {
        this.UserObject = userObject;
    }
}
public class User {
    private String name;
    private String email;
    private String password;
    private String user_type;
    private int user_id;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUser_type() {
        return user_type;
    }

    public int getUser_id() {
        return _user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
public class Painters {
    private Painter[] PainterObject;

    public Painter[] getPainter() {
        return PainterObject;
    }
    public void setPainter(Painter[] painterObject) {
        this.PainterObject = painterObject;
    }
}
public class Painter {
    private String info;
    private Paintings PaintingsObject;

    public String getInfo() {
        return info;
    }

    public Paintings getPaintings() {
        return PaintingsObject;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setPaintings(Paintings paintingsObject) {
        this.PaintingsObject = paintingsObject;
    }
}
public class Paintings {
    private Painting[] paintingObject;

    public Painting[] getPainting() {
        return paintingObject;
    }
    public void setPainting(Painting[] paintingObject) {
        this.painting = paintingObject;
    }
}
public class Painting {
    private String description;
    private String title;
    private int id;
    private String genre;
    private String date;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
