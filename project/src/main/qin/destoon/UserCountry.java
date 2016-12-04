package qin.destoon;

import java.util.HashSet;
import java.util.Set;

public class UserCountry
{
    private UserCountry parent;

    public UserCountry getParent()
    {
        return parent;
    }

    public void setParent(UserCountry parent)
    {
        this.parent = parent;
    }

    private Set<UserCountry> childrenSet = new HashSet<>();

    public Set<UserCountry> getChildrenSet()
    {
        return childrenSet;
    }

    public void setChildrenSet(Set<UserCountry> childrenSet)
    {
        this.childrenSet = childrenSet;
    }

    public UserCountry() {

    }

    public UserCountry(String name) {

    }
}