package io.choerodon.iam.app.service;

import io.choerodon.iam.infra.dto.CustomLayoutConfigDTO;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wanghao
 * @since 2021/1/5 18:05
 */
public interface CustomLayoutConfigService {
    CustomLayoutConfigDTO saveOrUpdateCustomWorkBeachConfig(CustomLayoutConfigDTO customLayoutConfigDTO);

    CustomLayoutConfigDTO saveOrUpdateCustomProjectOverview(Long projectId, CustomLayoutConfigDTO customLayoutConfigDTO);

    CustomLayoutConfigDTO queryCustomWorkBeachConfig();

    CustomLayoutConfigDTO queryCustomProjectOverview(Long projectId);
}
