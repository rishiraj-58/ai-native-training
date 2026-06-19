public class UserService {
    // public Map<Long, String> getUsernameById(List<User> users) {
    //     Map<Long, String> usernameById = new HashMap<>();
    //     for (User user : users) {
    //         usernameById.put(user.getId(), user.getUsername());
    //     }
    //     return usernameById;
    // }

    public Map<Long, String> getUsernameOnly(List<User> users) {
        return users.stream()
            .collect(Collectors.toMap(User::getId, User::getUsername));
    }

    public List<String> getUsernamesOnly(List<User> users) {
        return users.stream()
            .map(User::getUsername)
            .collect(Collectors.toList());
    }

    public Map<Long, String> getActiveUsernames(List<User> users) {
        return users.stream()
            .filter(User::isActive)
            .collect(Collectors.toMap(User::getId, User::getUsername));
    }
}
