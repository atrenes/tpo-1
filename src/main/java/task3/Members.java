package task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Members {
    public Members(List<Human> members) {
    this.members = members;
    }
    private List<Human> members = new ArrayList<>();



    public Members(Collection<Human> members) {
        this.members.addAll(members);
    }

    public int numberOfMembers() {
        return members.size();
    }

    public List<Human> getMembers() {
        return members;
    }

    public boolean isEmpty() {
        return members.isEmpty();
    }
    public void addMember(Human human) {
        if (members.contains(human)) {
            throw new IllegalArgumentException("Human already present in crew");
        } else {
            this.members.add(human);
        }
    }
    public void removeMember(Human human) {
        if (!members.contains(human)) {
            throw new IllegalArgumentException("Human not present in crew");
        } else {
            this.members.remove(human);
        }
    }
}
