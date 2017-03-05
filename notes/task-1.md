Task 1 -- Personal Planning
===========================

Instructions
------------

> When the client requests a list of books to present for the user it does the
> call `http://localhost:9090/api/books/` to the server and it expects the answer
> as a JSON object (an associative array). We are going to split the
> functionality into three tasks, but it is your task to plan these tasks. Take
> into account the time for learning and understanding of the problem when you
> plan the time. Make your planning with 15 minutes as the minimum unit. Repeat
> the following pattern for all subtasks (A, B, C):
>
> * Plan
> * Implement
> * Reflect
>
> Each subtask should be documented with at least 100 words.


Subtask A -- Books
------------------

### Instructions
> The main objective of the subtask is to create a list of books and a function
> or method to get them. There are slight differences depending on which
> implementation you are using, either Java or Node.js but those differences will
> be clearly noted. Common for both is that they should handle books, and for
> each book we need the information id, title, author, genre, publish date, price
> and description.
>
> ##### Java
> Create a class in the package “models” that represents a book. After that,
> create a short list of fictive (or real) objects in the function
> getBooks that is available in GetBooksResource. When calling the URL
> http://localhost:9090/api/books the list of books should be outputted with
> System.out.println. The subtask is done when you see the objects in the
> terminal (where vagrant is run).

### Plan
The `book` class is a critical datatype that will be used throughout the software.
As such, the class should be extendable and designed according to the "[open/closed principle]]",

The class must meet the following requirements:

* Encapsulate the information needed to describe books contained in the system
    * Id
    * Title
    * Author
    * genre
    * Date of publication
    * price
    * Description


### Implement

### Reflect



Subtask B -- JSON
-----------------

### Instructions
> Convert the objects created in subtask a into an JSON object and show it in the
> terminal using either System.out.println(Java) or console.log
> (Node.js).
>
> ##### Improvement Strategies
> Choose two improvement strategies based on your reflections on subtask a and b.
> Describe what you have decided to improve and why. Implement your improvements
> in the next subtask.


Subtask C -- Web
----------------
In this subtask you are to answer the request in the web browser instead of
printing it to the terminal. The subtask is done when you see the JSON object
on screen. For inspiration, have a look at PingResource that you find in the
same folder as the GetBooksResource. If you follow the
[API for the model](https://htmlpreview.github.io/?https://github.com/tobias-dv-lnu/1dv600-lab/blob/master/api-specification/api-specification.html)
(as seen in [GET api/books](https://htmlpreview.github.io/?https://github.com/tobias-dv-lnu/1dv600-lab/blob/master/api-specification/api-specification.html#books-get))​,
you will be able to show the books in the list.
