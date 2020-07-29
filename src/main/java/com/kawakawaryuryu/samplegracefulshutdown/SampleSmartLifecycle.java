package com.kawakawaryuryu.samplegracefulshutdown;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SampleSmartLifecycle implements SmartLifecycle {

  private boolean isRunning = false;

  @Override
  public void start() {
    this.isRunning = true;
    log.info("start");
  }

  @Override
  public void stop() {
    this.isRunning = false;
    log.info("end");
  }

  @Override
  public boolean isRunning() {
    return this.isRunning;
  }

  @Override
  public void stop(Runnable callback) {
    this.isRunning = false;
    log.info("end");
  }
}
