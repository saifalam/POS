/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaiser
 */
public class CurrentUserList {
    List <CurrentUser> aCurrentUserList = new ArrayList<CurrentUser>();

    public List<CurrentUser> getaCurrentUserList() {
        return aCurrentUserList;
    }

    public void setaCurrentUserList(List<CurrentUser> aCurrentUserList) {
        this.aCurrentUserList = aCurrentUserList;
    }
    
}
