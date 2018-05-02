package org.springframework.websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.websocket.controller.websocket.MarcoHandler_2;
import org.springframework.websocket.interceptor.WebSocketHandshakeInterceptor;

/**
 * Created by XiuYin.Cui on 2018/5/1.
 */

@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    /**
     *
     * @param registry 该对象可以调用addHandler()来注册信息处理器。
     */
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
          registry.addHandler(marcoHandler_2(),"/marco2")
                  .addInterceptors(webSocketHandshakeInterceptor());
    }


    @Bean
    public MarcoHandler_2 marcoHandler_2(){
        return new MarcoHandler_2();
    }

    @Bean
    public WebSocketHandshakeInterceptor webSocketHandshakeInterceptor(){
        return new WebSocketHandshakeInterceptor();
    }
}
