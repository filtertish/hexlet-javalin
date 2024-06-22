@import org.example.hexlet.dto.users.UserDto
@import org.example.hexlet.dto.users.ErrorData

@param UserDto user = null
@param ErrorData errorsDTO = null

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add user</title>
</head>
<body>
<header>
    <a href="/users">users</a>
</header>
<form action="/users" method="post">
    <label>
        Username:
        @if(user != null)
            <input type="text" name="username" value="${user.username()}">
        @else
            <input type="text" name="username" value="">
        @endif
    </label>
    <label>
        Email:
        @if(user != null)
            <input type="text" name="email" value="${user.email()}">
        @else
            <input type="text" name="email" value="">
        @endif
    </label>
    <label>
        Password:
        <input type="text" name="password" required>
    </label>
    <label>
        Password again:
        <input type="text" name="password-again" required>
    </label>
    <button>Add user</button>
    @if(errorsDTO != null)
        @if(!errorsDTO.errors().isEmpty())
            @for(var error : errorsDTO.errors())
                <p>Error: ${error}</p>
            @endfor
        @endif
    @endif
</form>
</body>
</html>