@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.repository.UsersRepository

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users list</title>
</head>
<body>
<header>
    <a href="/">main</a>
    <a href="${NamedRoutes.buildUsersRoot()}">add user</a>
</header>
@if(UsersRepository.getUsers().isEmpty())
    <p>No users found</p>
@else
    @for(var user : UsersRepository.getUsers())
        <div style="border: 1px solid black">
            <p>${user.name()}</p>
            <p>${user.email()}</p>
        </div>
    @endfor
@endif
</body>
</html>