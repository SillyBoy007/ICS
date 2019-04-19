package com.wxy.ics.member.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author wangxiayun
 * @date 2019-03-29
 */
@Slf4j
public class ObjectBuildUtils {

    public static <S, T> T copy(S from, Class<T> toClazz) {
        if (from == null) {
            return null;
        }

        try {
            T infoTo = toClazz.newInstance();
            BeanUtils.copyProperties(from, infoTo);
            return infoTo;
        } catch (InstantiationException | IllegalAccessException e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }

    public static <S, T> List<T> copy(List<S> from, Class<T> toClazz) {
        if (CollectionUtils.isEmpty(from)) {
            return Collections.emptyList();
        }

        List<T> result = new ArrayList<>(from.size());
        for (S src : from) {
            try {
                T infoTo = toClazz.newInstance();
                BeanUtils.copyProperties(src, infoTo);
                result.add(infoTo);
            } catch (InstantiationException | IllegalAccessException e) {
                log.error(e.getMessage(), e);
            }
        }

        return result;
    }

}
