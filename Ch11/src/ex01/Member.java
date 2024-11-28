package ex01;

import java.security.KeyStore;

public class Member {

    int id;

    public Member(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {

        if (obj instanceof Member) {

            Member m = (Member) obj;

            if (m.id == this.id)
                return true;
            else
                return false;

        }
        else
            return false;
    }

}
