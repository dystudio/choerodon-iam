package io.choerodon.iam.infra.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import org.hzero.iam.domain.entity.Label;
import org.hzero.iam.domain.entity.Role;

import io.choerodon.iam.api.vo.RoleNameAndEnabledVO;

/**
 * @author scp
 * @since 2020/4/26
 *
 */
public class RoleC7nDTO extends Role {
    private List<Label> labels;
    private String projName;
    private Integer userCount;

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    @ApiModelProperty(value = "角色列表")
    private List<RoleNameAndEnabledVO> roles;

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<RoleNameAndEnabledVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleNameAndEnabledVO> roles) {
        this.roles = roles;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }
}
